package proyek_160422073_server;

import java.util.Date;

/**
 * Represents a ticket in a ticket management system.
 */
public class Ticket {
    private int id;
    private String ticketName;
    private String ticketDesc;
    private Date ticketDate;
    private double ticketPrice;
    private Date createdDate;
    private Date updatedDate;

    /**
     * Constructs a new Ticket instance.
     * @param id
     * @param ticketName
     * @param ticketDesc
     * @param ticketDate
     * @param ticketPrice
     */
    public Ticket(int id, String ticketName, String ticketDesc, Date ticketDate, double ticketPrice) {
        this.id = id;
        this.ticketName = ticketName;
        this.ticketDesc = ticketDesc;
        this.ticketDate = ticketDate;
        this.ticketPrice = ticketPrice;
        // Assuming created and updated dates are set at the time of object creation.
        this.createdDate = new Date(); // Now
        this.updatedDate = new Date(); // Now
    }

    // Getters and setters for each field
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketDesc() {
        return ticketDesc;
    }

    public void setTicketDesc(String ticketDesc) {
        this.ticketDesc = ticketDesc;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticketName='" + ticketName + '\'' +
                ", ticketDesc='" + ticketDesc + '\'' +
                ", ticketDate=" + ticketDate +
                ", ticketPrice=" + ticketPrice +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
