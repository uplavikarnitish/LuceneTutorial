package indexer;

public class Indexer {

    public static void main(String[] args) throws Exception{
        // write your code here
        if (args.length !=2 )
        {
            throw new Exception("Usage Java "+ Indexer.class.getName()+"<index dir> <data dir>");
        }
    }
}