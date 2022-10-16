# Installation

## Installing Text Editor

テキストエディタをインストールしましょう。<br>
ここから Atom というテキストエディタをインストール：https://atom.io/

## Installing Java

サイトの指示に従って Java をここからインストールしましょう：https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html

Windows の方：<br>
Java 　 8（jdk1.8.0_291） をインストールしてください。<br>
インストール後、jdk1.8.0_291 が　 C:/Program Files/Java 　内にある場合は、C:/Java/jdk1.8.0_291 　になる様フォルダを移動してください。<br>
インストール完了後は、環境変数の設定を忘れずに行ってください。<br>
コマンドプロンプトを起動し、下記 2 つのコマンドを run し、環境変数の設定が正しくできたか確認してください。<br>

```
java -version
set path　
```
MacOS の方：<br>
こちらのリンクからJava8をインストールしてください。
https://mkyong.com/java/how-to-install-java-on-mac-osx/#homebrew-install-java-8-on-macos

## macOS

次に、Maplecat のインストールをします。<br>
[ここ](00_01_download/README.md)でダウンロードし、解凍します。<br>
解凍したディレクトリを Atom で開きます。<br>
`bin`ディレクトリを開いて`maplecatd`ファイルを開きます。<br>

`ダウンロードしたファイル/bin/maplecatd`ファイルの一部を以下のように編集

```
app_home="プロジェクトディレクトリ"
jdk_home="JDKのHOMEディレクトリ（Macの場合は/Library/Java/JavaVirtualMachines/jdk＜JDKのバージョン（バージョンは最新のであれば問題ありません、例：jdk-13.0.0）＞/Contents/Home/"
```

例えば、Java を Mac で Oracle のサイトからダウンロードし、Maplecat のサイトからダウンロードしたディレクトリが`Users/username/Downloads/maplecat(ダウンロードしたディレクトリ)`にあった場合、

```
app_home="Users/username/Downloads/maplecat"
jdk_home="/Library/Java/JavaVirtualMachines/jdk-13.10.1/Contents/Home/"
```

おそらくこのようになります。（JDK のバージョンはちゃんと確認してください）<br>
次にターミナル（Windows の場合はコマンドプロンプト）で、<br>
`cd ＜ダウンロードしたディレクトリ(e.g. ~/Downloads/maplecat)＞`<br>
その後、`./bin/maplecatd run`コマンドを実行します。

## WindowsOS

次に、Maplecat のインストールをします。<br>
[ここ](00_01_download/README.md)でダウンロードし、解凍します。<br>
解凍したディレクトリを Atom で開きます。<br>
`bin`ディレクトリを開いて`maplecatd`と`maplecatd.bat`ファイルを更新していきます。<br>

`ダウンロードしたファイル/bin/maplecatd`ファイルと`ダウンロードしたファイル/bin/maplecatd.bat`の一部を以下のように編集

```
app_home="プロジェクトディレクトリ"
jdk_home="JDKのHOMEディレクトリ"
```

おそらく下記のようになります。（JDK のバージョンはちゃんと確認してください）<br>

```
app_home="C:/Users/username/Downloads/maplecat_home/"
jdk_home="C:/Java/jdk1.8.0_291/"
```

また、maplecatd.bat のほうは、ダブルクォーテーション（"）を使っていない事に注意してください。<br>
その後、`cd bin` と次に　`./maplecatd.bat run`コマンドを実行します。

[http://localhost:9090](http://localhost:9090) にアクセスするとサイトがみれます。
