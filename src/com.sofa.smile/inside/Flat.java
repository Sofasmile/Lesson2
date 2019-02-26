package inside;

public class Flat {
    private int squareMeters;
    private Room rooms;

    public Flat(int squareMeters, int numberOfRooms) {
        this.squareMeters = squareMeters;
        rooms = new Room(numberOfRooms);
    }

    // Anonymous  class
    private Repair repair = new Repair() {
        @Override
        public void paintWall() {
            System.out.println("Red walls");
        }

        @Override
        public void paintFloor() {
            System.out.println("Black floor");
        }
    };

    public void showRepair() {
        repair.paintFloor();
        repair.paintWall();
    }

    //Inner class
    private class Room {
        private int numberOfRoom;

        private Room(int numberOfRoom) {
            this.numberOfRoom = numberOfRoom;
        }

        private double averageAreaRoom() {
            if (numberOfRoom == 0) {
                return 0;
            } else {
                return squareMeters / numberOfRoom;
            }
        }
    }

    public void information() {
        System.out.println("Total area of the flat is " + squareMeters);
        System.out.println("Average area of each room is " + rooms.averageAreaRoom());
    }

    //Static nested class
    public static class TypeOfFlat extends Flat {
        private String typeOfFlat;

        public TypeOfFlat(int squareMeters, int numberOfRooms, String typeOfFlat) {
            super(squareMeters, numberOfRooms);
            this.typeOfFlat = typeOfFlat;
        }

        public void showType() {
            System.out.println(typeOfFlat);
        }
    }

    //Local class
    public void doorInFlat() {
        class Door {
            private void showDoor() {
                System.out.println("The flat must have at least one door!");
            }
        }
        Door door = new Door();
        door.showDoor();
    }
}
