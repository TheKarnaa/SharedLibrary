
def gitDownload(repo)
{
  git "https://github.com/TheKarnaa/${repo}.git"
}
def newBuild()
{
  sh 'mvn package'
}
def neDeploy(jobname,ip,appname)
{
   sh "scp  /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def newTesting()
{
  
}
