public class Student {

        public    int id;
        public    String name;
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public Student() {
            this.id = 0;
            this.name = "";
        }



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return
                    "(" + id +
                            "," + name  +
                            ")";
        }
    }



