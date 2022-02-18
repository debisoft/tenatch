setlocal
:: User setup.
:: note: Needs Java 8 and above to use this batch file(uses wildcat matching for classpath).

:: Step 1: Specify your app_home here
:: eg. app_home="C:/work/deploy/maplecat_home/"
set app_home=C:/Users/Chihiro/Desktop/Maplecat/maplecat_home

:: Step 2: change this to point to your JDK directory.
:: eg. jdk_home="C:/Program^ Files/Java/jdk1.8.0_xxx/"
:: (use the caret ^ before a space in the directory name)
set jdk_home=C:/Java/jdk1.8.0_291/

java -classpath "../sys/lib/*" -Dapp.home=%app_home% -Djdk.home=%jdk_home% com.tenatch.maplecat.startup.StandAloneServer run %1 %2 %3 %4 %5
