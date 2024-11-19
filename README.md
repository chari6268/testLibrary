## Setup
> Step 1. Add it in your root build.gradle at the end of repositories:
```xml
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
or
```xml

allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
> Step 2. Add the dependency
```xml
dependencies {
	implementation 'com.github.chari6268:testLibrary:Tag'
}
```
