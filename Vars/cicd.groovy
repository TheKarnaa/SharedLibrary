
def gitDownload(repo)
{
  git "https://github.com/TheKarnaa/${repo}.git"
}
def newBuild()
{
  sh 'mvn package'
}
