import hudson.model.*
def call() {
    echo "building the application..."
    sh 'mvn package'
} 

