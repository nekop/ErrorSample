ErrorSample
===========

WildFly Error Sample

WildFly 8.0.0 Beta1 にデプロイできないプロジェクトのサンプルです。

ErrorSampleEJB と ErrorSampleJSF を EAR プロジェクトに追加して、その EAR プロジェクトを Eclipse で
WildFly に追加して WildFly を起動すると ContextNotActiveException が発生してデプロイに失敗します。

なお、必要な DataSource と JDBC ドライバは既に設定済みであるものとします。
