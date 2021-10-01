# Installation

## Installing Text Editor
テキストエディタをインストールしましょう。<br>
ここからAtomというテキストエディタをインストール：https://atom.io/

## Installing Java
サイトの指示に従ってJavaをここからインストールしましょう：https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html

Windows の方：<br>
   Java　8（jdk1.8.0_291） をインストールしてください。<br>
   インストール後、jdk1.8.0_291が　C:/Program Files/Java　内にある場合は、C:/Java/jdk1.8.0_291　になる様フォルダを移動してください。<br>
   インストール完了後は、環境変数の設定を忘れずに行ってください。<br>
   コマンドプロンプトを起動し、下記2つのコマンドをrunし、環境変数の設定が正しくできたか確認してください。<br>  
  ```
  java -version
  set path　
  ```
## macOS
[ここ](00_01_download/README.md)でダウンロードし、解凍します。<br>
解凍したディレクトリをAtomで開きます。<br>
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
次に、firecatのインストールをします。<br>
[ここ](00_01_download/README.md)でダウンロードし、解凍します。<br>
解凍したディレクトリをAtomで開きます。<br>
`bin`ディレクトリを開いて`aussiecatd`と`aussiecatd.bat`ファイルを更新していきます。<br>

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

また、aussiecatd.batのほうは、ダブルクォーテーション（"）を使っていない事に注意してください。<br>
その後、`cd bin` と次に　`./aussiecatd.bat run`コマンドを実行します。

[http://localhost:9090](http://localhost:9090) にアクセスするとサイトがみれます。
