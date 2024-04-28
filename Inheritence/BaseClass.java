package Inheritence;

import java.time.LocalDate;

public class BaseClass<Tid> {
    private Tid id;

    private LocalDate createdDate;

    private LocalDate updatedDate;

    private LocalDate deletedDate;



    public Tid getId() {
        return id;
    }

    public void setId(Tid id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDate getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDate deletedDate) {
        this.deletedDate = deletedDate;
    }

    public BaseClass(Tid id) {
        this.id = id;

    }
    public BaseClass(){}
}
