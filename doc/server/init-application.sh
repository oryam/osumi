#!/bin/bash
# Initialize server for application

# Use root user to create folders in /apps/osumi
echo Connect as root to create folders in /apps/osumi
read -p "Press any key to continue..."

cd /apps/osumi

# Create folders with access rights
folders=( archive temp application application/bin application/service application/front application/logs application/pid )
for i in "${folders[@]}"
do
    mkdir $i
    chown osumi:osumi $i
    chmod 744 $i
done

# Initialize empty files with access rights
files=( init-application.sh deploy.sh application/bin/start-osumi-application.sh application/bin/stop-osumi-application.sh application/bin/check-osumi-application.sh application/service/osumi-application.jar )
for i in "${files[@]}"
do
    touch $i
    chown osumi:osumi $i
    chmod 744 $i
done


#dos2unix init-application.sh
#chown osumi:osumi init-application.sh
#chmod 744 init-application.sh

exit 0
