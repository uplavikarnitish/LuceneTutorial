package indexer;

public class Indexer {

    public static void main(String[] args) throws Exception{
        // write your code here
        if (args.length !=2 )
        {
            throw new Exception("Usage Java "+ Indexer.class.getName()+"<index dir> <data dir>");
        }
        String indexDir = args[0];
        String dataDir = args[1];

        long start = System.currentTimeMillis();
        Indexer indexer = new Indexer(indexDir);
        int numIndexed = indexer.index(dataDir);
        indexer.close();
        long end = System.currentTimeMillis();
        System.out.println("Indexing "+numIndexed+" files took "+(end-start)+" milliseconds.");
    }
}