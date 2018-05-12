Java プロジェクトの作り方
===========================

1. JDK をインストールして ```JAVA_HOME``` を設定する

2. Maven をインストールする

```
npm install mvn -g
```

3. Maven の archetype プラグインを実行し、プロジェクトを作成する

```
mvn archetype:generate -DgroupId=teamitp -DartifactId=cards -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Java プロジェクトの実行方法
===========================

1. exec-maven-plugin プラグインを POM.xml に追加する

2. コマンド ```mvn exec:java``` を実行しプログラムを実行する

JUnit の実行
===========================

1. コマンド ```mvn test``` を実行する
