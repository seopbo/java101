public class Theater {
    private Seat[][] seats;
    private int rowCount, colCount;

    public Theater (int rowCount, int colCount) {
        this.seats = new Seat[rowCount][colCount];
        this.rowCount = rowCount;
        this.colCount = colCount;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                this.seats[i][j] = new Seat();
            }
        }
    }
    public boolean reserve (String name, char rowChar, int col, int numSeat) {
        if (this.getRowIndex(rowChar) > this.rowCount - 1 || this.getRowIndex(rowChar) < 0) {
            return false;
        }

        if (col > this.colCount || col < 1) {
            return false;
        }

        int rowIndex = this.getRowIndex(rowChar);
        int colIndex = col - 1;

        if (colIndex + numSeat - 1 > this.colCount - 1) {
            return false;
        }

        Seat[] rowOfSeats = this.seats[rowIndex];

        int emptySeat = 0;

        for (int i = 0; i < numSeat; i++) {
            if (!rowOfSeats[colIndex].isOccupied()) {
                emptySeat++;
            }
            colIndex++;
        }

        if (emptySeat != numSeat) {
            return false;
        } else{
            colIndex = col - 1;
            for (int i = 0; i < numSeat; i++) {
                rowOfSeats[colIndex].reserve(name);
                colIndex++;
            }
            return true;
        }
    }

    public int cancel(String name) {
        int cancelCount = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                Seat seat = this.seats[i][j];
                if (seat.getName() == name) {
                    seat.cancle();
                    cancelCount++;
                }
            }
        }
        return cancelCount;
    }

    public int cancel(char rowChar, int col, int numSeat) {
        int cancleCount = 0;
        int rowIndex = getRowIndex(rowChar);
        int colIndex = col - 1;

        Seat[] rowOfSeats = this.seats[rowIndex];
        for (int i = 0;i < numSeat; i++) {
            if (rowOfSeats[colIndex].isOccupied()) {
                rowOfSeats[colIndex].cancle();
                cancleCount++;
                colIndex++;
            }
        }
        return cancleCount;
    }

    public int getNumberOfReservedSeat() {
        int occupiedCount = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (this.seats[i][j].isOccupied()) {
                    occupiedCount++;
                }
            }
        }
        return occupiedCount;
    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= colCount; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
}