package guru.qa;

public class Train {
    String name;
    int releaseDate;
    boolean airСonditioner;
    String madeIn;
    String modelNumber;

    public Train(String name, int releaseDate, boolean airСonditioner, String madeIn, String modelNumber) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.airСonditioner = airСonditioner;
        this.madeIn = madeIn;
        this.modelNumber = modelNumber;
    }

    void nameTrain(){
        System.out.println("Название электропоезда " + name );
    }

    void numberModel(){
        System.out.println("Номер модели " + modelNumber);
    }

    void dateRelease(){
        System.out.println("Дата начала производства " + releaseDate);
    }

    void presenceAirСonditioner(){
        if(airСonditioner == true){
            System.out.println("На составе присутствует кондиционер");
        } else {
            System.out.println("На составе отсутствует кондиционер");
        }
    }
}
