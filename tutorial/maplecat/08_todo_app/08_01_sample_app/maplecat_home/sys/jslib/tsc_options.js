    var compilerOptions = {
      noEmitOnError : false,
      emitDecoratorMetadata: false,
      experimentalDecorators: false,
      newLine: 'LF',
      noImplicitAny : false,
      target : ts.ScriptTarget.ES5,
      targets: {
        "node": 5.9
      },
      module : "AMD",
      inlineSourceMap: true
    };

    var transpileOptions = {
      compilerOptions : compilerOptions,
      reportDiagnostics: false
    };
