
rootProject.name = "sample_using_private_repo"

sourceControl{
    gitRepository(java.net.URI.create("ssh://git@github.com/Kesigomon/sample_private_repo")){
        producesModule("com.kesigomon:sample_private_repo")
    }
}