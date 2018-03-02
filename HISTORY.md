# HISTORY

## Getting started

Initialize Maven project `osumi` from `quickstart-service-archetype`

```
mvn archetype:generate -DarchetypeGroupId=com.oryam.maven.archetype -DarchetypeArtifactId=quickstart-service-archetype -DarchetypeVersion=1.0.4 -DgroupId=com.oryam.service.osumi -DartifactId=osumi -Dversion=0.0.1-SNAPSHOT
```

Initialize Front project from `angular-cli` generator

```
ng new osumi --prefix=osu --style=scss --routing=true --skip-tests=true
```

## Openshift

- Add `openshift` maven profile, used by default in Openshift sefl hosted
- Use running port 8080 as it is the default target port mapping in Openshift deployment config
- Add webhook
- Add live probe

**To test loadbalancing with multiple pods**

`while true; do curl -s http://java-ws-java.7e14.starter-us-west-2.openshiftapps.com/service/rest/item; echo ""; sleep 1; done`

