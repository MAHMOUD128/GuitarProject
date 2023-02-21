public class FindGuitarTester {
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();

        inventory.addGuitar("1",1542.5,"xsad","1554cv"
                ,"electrical","zaner","nakedr");
        Guitar wiliam =new Guitar("2",21.2,"xsad","1554cv"
                ,"electrical","zaner","nakedr");
        Guitar guitar =inventory.search(wiliam);
        if(guitar != null)
        {
            System.out.println
                    ("yes we found it (: "+
                            "the builder: "+guitar.getBuilder()+" the model: "+guitar.getModel()+" the type: "+guitar.getType()
                            +" the backWood: "+guitar.getBackWood()+" the topWood: "+guitar.getBackWood()
                    );
        }
        else {
            System.out.println("sorry , we don't found it ):");
        }


    }

}
