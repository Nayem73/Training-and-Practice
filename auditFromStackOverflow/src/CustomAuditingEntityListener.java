public class CustomAuditingEntityListener extends AuditingEntityListener {

    @PrePersist
    @Override
    public void touchForCreate(Object target) {
        super.touchForCreate(target);
        if (target instanceof Auditable) {
            ((Auditable) target).addEditor(((Auditable) target).getLastModifiedBy());
        }
    }

    @PreUpdate
    @Override
    public void touchForUpdate(Object target) {
        super.touchForUpdate(target);
        if (target instanceof Auditable) {
            ((Auditable) target).addEditor(((Auditable) target).getLastModifiedBy());
        }
    }
}