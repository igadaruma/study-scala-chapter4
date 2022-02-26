import play.sbt.PlayImport.PlayKeys.devSettings
// Scalaプロジェクト全体の設定や必要なライブラリの追加を行うファイルです。
// build.sbtはScala開発の場合はほぼ100%利用します。

name := """study-scala-chapter4""" // このプログラム全体(プロジェクト)の名前
version := "1" // このプロジェクトのバージョン
scalaVersion := "2.13.8" // 利用するScalaのバージョン
lazy val root = (project in file(".")).enablePlugins(PlayScala) // Play Frameworkプラグインの有効化
libraryDependencies += guice // 必要なライブラリの追加

// URLに含まれるポート番号を標準の9000から9004に変更しています。
devSettings := Seq("play.server.http.port" -> "9004")
