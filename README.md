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
## License
```
Copyright 2024 Perusomula Srinivasa Chari

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
