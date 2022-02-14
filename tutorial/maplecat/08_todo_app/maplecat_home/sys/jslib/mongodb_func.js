let mondb = {
	connectDB: function(server_name, db_name)
	{
		let mongoClient = mgodb.getMongoClient(server_name);
		let db = mongoClient.getDB(db_name);
		return mgodb.makeJongo(db);

	},
	find: function(collection, json_str)
	{
		return collection.find(json_str).map(
			r => JSON.parse(r)
		);
	},
	findOne: function(collection, json_str)
	{
		return collection.findOne(json_str).map(
			r => JSON.parse(r)
		);
	},
	findWithId: function(collection, object_id_str)
	{
		return collection.findOne(mgodb.makeObjectId(object_id_str)).map(
			r => JSON.parse(r)
		);
	},
	insert: function(collection, json_obj)
	{
		return collection.insert(mgodb.parseJSON(json_obj));
	},
	insertStr: function(collection, json_str)
	{
		return collection.insert(JSON.parse(json_str));
	},
	makeJSON: function(r)
	{
		return JSON.parse(r);
	},
	/*
	makeJSON: function(finder)
	{
		return finder.map(
			r => JSON.parse(r)
		);
	},
	*/
	remove: function(collection, json_str)
	{
		return collection.remove(json_str);
	},
	removeWithId: function(collection, object_id_str)
	{
		return collection.remove(mgodb.makeObjectId(object_id_str));
	},
	upsert: function (collection, json_obj)
	{
			if(json_obj._id)
				return collection.update('{_id: {$oid: "' + json_obj._id.$oid + '"}}').upsert().with(json_obj);
			else
				return insert(collection, json_obj);
	},
	update: function (collection, json_obj)
	{
		return collection.update('{_id: {$oid: "' + json_obj._id.$oid + '"}}').with(json_obj);
	},
	updateOneWith: function (collection, json_str, json_obj)
	{
		return collection.update(json_str).with(json_obj);
	},
	updateWith: function (collection, json_str, json_obj)
	{
		return collection.update(json_str).multi().with(json_obj);
	}
}
