# Installation

## Installing Text Editor
テキストエディタをインストールしましょう。<br>
ここからAtomというテキストエディタをインストール：https://atom.io/

## Installing Java
サイトの指示に従ってJavaをここからインストールしましょう：https://docs.oracle.com/en/java/javase/13/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A

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

例えば、JavaをMacでOracleのサイトからダウンロードし、Firecatのサイトからダウンロードしたファイルが`Users/username/Downloads/aussiecat(ダウンロードしたディレクトリ)`にあった場合、
```
app_home="Users/username/Downloads/aussiecat"
jdk_home="/Library/Java/JavaVirtualMachines/jdk-13.10.1/Contents/Home/"
```
おそらくこのようになります。（JDKのバージョンはちゃんと確認してください）<br>
次に`./catd run`コマンドを実行します。

その後、http://localhost:8080
にアクセスます。
