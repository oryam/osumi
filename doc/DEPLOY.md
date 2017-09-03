# DEPLOY


# INSTALLATION

A complete guide to install the deployable environment from scratch. 
Take steps you need, depending your use case.



## with `root` user

* As `root` user, check if `osumi` user exist
`cat /etc/passwd | grep osumi`
`cat /etc/group | grep osumi`

* Create the apps home directory
`mkdir /apps/osumi`

* As root user, check if `osumi` user exist
`adduser --no-create-home --home /apps/osumi osumi`
`passwd osumi` # example of password: osumiWD1

* In case you need to remove the user
`userdel osumi`
(use -r option to remove the home dir `userdel -r osumi`)

* prepare empty `init-application.sh`
`touch /apps/osumi/init-application.sh`
`chown osumi:osumi /apps/osumi/init-application.sh`
`chmod 744 /apps/osumi/init-application.sh`



## with `root` user in `/apps/osumi/`

- go into `/apps/osumi/`
- check the content of your script `init-application.sh`
- copy/upload on the server the script `init-application.sh`
- check/apply execution right for owner `osumi`
- run `dos2unix init-application.sh`
- apply again osumi right `chown osumi:osumi init-application.sh`
- execute `init-application.sh`

- check the content of your script `deploy.sh`
- copy the `deploy.sh`
- check/apply execution right for owner `osumi`
- run `dos2unix deploy.sh`
- apply again osumi right `chown osumi:osumi deploy.sh`



## with `osumi` user in `/apps/osumi/application/bin`

- go into `/apps/osumi/application/bin`

- copy/upload on the server the script `check-osumi-application.sh`
- copy/upload on the server the script `start-osumi-application.sh`
- copy/upload on the server the script `stop-osumi-application.sh`

Optional: In case files are not in UNIX format, run dos2unix as root, then apply osumi owner right
- run `dos2unix *.sh`
- apply again osumi right `chown osumi:osumi *.sh`



## with `osumi` user in `/apps/osumi/`

- go into `/apps/osumi/`
- run `./deploy.sh`

- when application is completely started, upload static resources (html, js, ...), in `/apps/osumi/application/front`
	- delete existing ones
	- upload new ones

# Check

Make some checks on files.

- application class name for main in start script.
- jmx port not already used in start script.


# Virtual partition

Useful command lines to check or create partition and mount.

## Info

df -k
vgs    # virtual ...
lvs    # logical volume info
lvdisplay    # logical volume details
pvs          # physical volume

## Create

lvcreate -L 1G -n lv_osumi vg_apps

cat /etc/fstab
vi /etc/fstab    # add the mount point, yy, p
mkfs -t ext4 /dev/vg_apps/lv_osumi
mount /apps/osumi

## Reduce size

umount /apps/osumi
lvreduce -L 1G vg_apps/lv_osumi
mount /apps/osumi

