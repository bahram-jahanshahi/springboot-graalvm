# Spring boot and GraalVM
### Install GraalVM (macOS M1)

- Follow this instruction [Installation on Linux ARM64 systems
](https://www.graalvm.org/docs/getting-started/linux-aarch64/).  
- Download the Java 17 GraalVM from [here](https://github.com/graalvm/graalvm-ce-builds/releases)
- **NOTICE:** run this command ``sudo xattr -r -d com.apple.quarantine path/to/graalvm/folder/``

### Setup JAVA_HOME
```shell
export JAVA_HOME=<path_to_graalvm>/graalvm-ce-java17-21.3.0/Contents/Home/
```
### Build by Maven
When you run this command ``mvn --version``, the version of Java has to be exactly what is set for JAVA_HOME.  
Run this command to build a **native java**  
```shell
mvn -DskipTests=true -Pnative clean package
```
### Run by Native!
Go to the `target` folder and run this command
```shell
./springboot-graalvm 
```
