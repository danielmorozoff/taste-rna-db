package db_boot;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class TasteDB {
	
	public static GraphDatabaseService  tasteDB;
	
	private static final String DB_PATH = "TasteDB";
	private static final String DB_CONFIG_PATH = "TasteDB/configs/";
	
	/**
	 * Class constructor only run on startup
	 */
	public TasteDB(){
		System.out.println("Starting up TasteDB...");
		tasteDB = new  GraphDatabaseFactory().newEmbeddedDatabaseBuilder( DB_PATH )
			    .loadPropertiesFromFile( DB_CONFIG_PATH + "neo4j.properties" )
			    .newGraphDatabase();
		registerShutdownHook( tasteDB );
	}
	

	private static void registerShutdownHook( final GraphDatabaseService graphDb )
	{
	    Runtime.getRuntime().addShutdownHook( new Thread()
	    {
	        @Override
	        public void run()
	        {
	            graphDb.shutdown();
	        }
	    } );
	}
}
