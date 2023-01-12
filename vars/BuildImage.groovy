import hudson.model.*
def BuildImage() {
    echo "building the application..."
    sh 'mvn packagei'
} 

