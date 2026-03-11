package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    //SOLUÇÃO BOA:
    public void updateDates(Date checkIn, Date checkOut){
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new IllegalArgumentException("Reservation dates for updates must be future dates ");
            //Usamos essa excecao no Java quando os argumentos que passamos para o métodos sao invalidos.
        }
        if(!checkOut.after(checkIn)){
            throw new IllegalArgumentException("Check-out date must be after check-in date ");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString(){
        return "Room"
                + roomNumber
                + ", check-in: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }
}
