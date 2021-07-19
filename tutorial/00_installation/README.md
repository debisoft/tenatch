# Installation

## Installing Text Editor
テキストエディタをインストールしましょう。<br>
ここからAtomというテキストエディタをインストール：https://atom.io/

## Installing Java
サイトの指示に従ってJavaをここからインストールしましょう：https://docs.oracle.com/en/java/javase/13/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A

Windows の方は、Java　8（jdk1.8.0_291） をインストールしてください。
インストール後、jdk1.8.0_291が　C:/Program Files/Java　内にある場合は、C:/Java/jdk1.8.0_291　になる様フォルダを移動してください。

## macOS
[ここ](http://firecat256.appspot.com/kiwicat/aussiecat_1_1_x/svs_2/downloads.nsp)でインストール<br>
MacのかたはLinuxでお願いします。<br>
ダウンロードしたディレクトリをAtomで開きます。<br> 
`bin`ディレクトリを開いて`aussiecatd`ファイルを開きます。<br>

`ダウンロードしたファイル/bin/aussiecatd`ファイルの一部を以下のように編集

```
app_home="プロジェクトディレクトリ"
jdk_home="JDKのHOMEディレクトリ（Macの場合は/Library/Java/JavaVirtualMachines/jdk＜JDKのバージョン（バージョンは最新のであれば問題ありません、例：jdk-13.0.0）＞/Contents/Home/"
```

例えば、JavaをMacでOracleのサイトからダウンロードし、Firecatのサイトからダウンロードしたディレクトリが`Users/username/Downloads/aussiecat(ダウンロードしたディレクトリ)`にあった場合、
```
app_home="Users/username/Downloads/aussiecat"
jdk_home="/Library/Java/JavaVirtualMachines/jdk-13.10.1/Contents/Home/"
```
おそらくこのようになります。（JDKのバージョンはちゃんと確認してください）<br>
次にターミナル（Windowsの場合はコマンドプロンプト）で、<br>
`cd ＜ダウンロードしたディレクトリ(e.g. ~/Downloads/aussiecat)＞`<br>
その後、`./bin/aussiecatd run`コマンドを実行します。

## WindowsOS
次に、firecatのインストールをします。
[ここ](http://firecat256.appspot.com/kiwicat/aussiecat_1_1_x/svs_2/downloads.nsp)でインストール<br>
ダウンロードしたディレクトリをAtomで開きます。<br> 
`bin`ディレクトリを開いて`aussiecatd`と`aussiecatd.bat`ファイルを開きます。<br>

`ダウンロードしたファイル/bin/aussiecatd`ファイルと`ダウンロードしたファイル/bin/aussiecatd.bat`の一部を以下のように編集
```
app_home="プロジェクトディレクトリ"
jdk_home="JDKのHOMEディレクトリ"
```
おそらく下記のようになります。（JDKのバージョンはちゃんと確認してください）<br>
```
app_home="C:/Users/username/Downloads/aussiecat_home/"
jdk_home="C:/Java/jdk1.8.0_291/"
```
その後、`cd bin` と次に　`./aussiecatd.bat run`コマンドを実行します。

[http://localhost:9090](http://localhost:9090) にアクセスするとサイトがみれます。

