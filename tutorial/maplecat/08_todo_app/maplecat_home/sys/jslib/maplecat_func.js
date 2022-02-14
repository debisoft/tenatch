let mpc = {
	readJsonFile: function(path_str, charset)
	{
		return JSON.parse(motorUtils.readStrFromInputStream(weppliContext.getResourceAsStream(path_str), charset));
	},
	getReqJSON: function()
	{
		return JSON.parse(request.getReqParam('json'));
	}
}
