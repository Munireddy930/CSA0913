interface printable{
    void print()
};
    interface showable{
        void show()    
    }
    class  A implements printable,showable{
        void print()
        {
            System.out.println("hello");
        }
        void show()
        {
            System.out.println("Welcome to java");
        }
    
    }
}