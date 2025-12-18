        public static void viewAvenger() throws SQLException 
        {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM avengers");
        }