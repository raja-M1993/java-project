pipeline
{
agent any
stages{
stage('build')
{
steps
{
sh'ant -f build.xml -v'
}
}
}
post
{
always
{
archiveArtifact artifact:'dist/*.jar', fingerprint:true
}
}
}
