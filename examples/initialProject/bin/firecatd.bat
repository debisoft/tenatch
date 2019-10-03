setlocal
:: User setup.
:: note: Needs Java 6 and above to use this batch file(uses wildcat matching for classpath).

:: Step 1: Specify your app_home here
:: eg. app_home=C:/work/deploy/firecat_home/
set app_home=C:/work/deploy/firecat_home/

:: Step 2: change this to point to your JDK directory.
:: eg. jdk_home=C:/Program Files/Java/jdk1.6.0_25/
set jdk_home=C:/Program Files/Java/jdk1.6.0_25/

java -classpath "../sys/lib/*" -Dapp.home="%app_home%" -Djdk.home="%jdk_home%" jp.nihonsoft.firecat.startup.StandAloneServer run %1 %2 %3 %4 %5
