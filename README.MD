### Compile:
- dir /s /B *.java > sources.txt;
- javac @sources.txt -d <out-path>.

### Create jar:
- jar cvf <filename>.jar  <path-to-root-package>

### Run jar:
- java -cp <path-to-jar> <main-class>

### Example:
dir /s /B *.java > sources.txt
javac @sources.txt -d myOut/by
cd myOut
jar cvf myJar.jar by
java -cp myJar.jar by.varyvoda.matvey.Main
