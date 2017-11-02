package org.kudos;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class KudosMongoClient {

    public static void main (String[] args){
//
//        MongoClient mongoClient = new MongoClient();
//        MongoDatabase database = mongoClient.getDatabase("mydb");
//        MongoCollection<Document> collection = database.getCollection("test");
//
//        //insertInitialDocuments(collection);
//
//        System.out.println(collection.count());
//
//        Document myDoc = collection.find().first();
//        System.out.println(myDoc.toJson());
    }

    private static void insertInitialDocuments(MongoCollection<Document> collection) {
        Document doc = new Document("Name", "LeBron James")
                .append("Craft", "Basketball")
                .append("skills", getBasketballSkills())
                .append("photo", "https://nba-players.herokuapp.com/players/james/lebron");


        Document doc2 = new Document("Name", "Carmelo Anthony")
                .append("Craft", "Basketball")
                .append("skills", getBasketballSkills())
                .append("photo", "https://nba-players.herokuapp.com/players/anthony/carmelo");

        collection.insertOne(doc);
        collection.insertOne(doc2);
    }

    private static Document getBasketballSkills() {
        return new Document("Shooting", 0).append("Dunking" , 0).append("Passing", 0).append("Defending", 0);
    }

}
