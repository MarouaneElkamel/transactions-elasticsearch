package kaoun.flouci.transactions.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Transaction.
 */
@Entity
@Table(name = "transaction")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "transaction")
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "transid", nullable = false)
    private String transid;

    @NotNull
    @Column(name = "transtype", nullable = false)
    private String transtype;

    @NotNull
    @Column(name = "fromacct", nullable = false)
    private String fromacct;

    @NotNull
    @Column(name = "status", nullable = false)
    private String status;

    @NotNull
    @Column(name = "destination", nullable = false)
    private String destination;

    @NotNull
    @Column(name = "amount", precision = 10, scale = 2, nullable = false)
    private BigDecimal amount;

    @NotNull
    @Column(name = "fee", precision = 10, scale = 2, nullable = false)
    private BigDecimal fee;

    @NotNull
    @Column(name = "jhi_timestamp", nullable = false)
    private LocalDate timestamp;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransid() {
        return transid;
    }

    public Transaction transid(String transid) {
        this.transid = transid;
        return this;
    }

    public void setTransid(String transid) {
        this.transid = transid;
    }

    public String getTranstype() {
        return transtype;
    }

    public Transaction transtype(String transtype) {
        this.transtype = transtype;
        return this;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getFromacct() {
        return fromacct;
    }

    public Transaction fromacct(String fromacct) {
        this.fromacct = fromacct;
        return this;
    }

    public void setFromacct(String fromacct) {
        this.fromacct = fromacct;
    }

    public String getStatus() {
        return status;
    }

    public Transaction status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDestination() {
        return destination;
    }

    public Transaction destination(String destination) {
        this.destination = destination;
        return this;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Transaction amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public Transaction fee(BigDecimal fee) {
        this.fee = fee;
        return this;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public Transaction timestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transaction transaction = (Transaction) o;
        if (transaction.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), transaction.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Transaction{" +
            "id=" + getId() +
            ", transid='" + getTransid() + "'" +
            ", transtype='" + getTranstype() + "'" +
            ", fromacct='" + getFromacct() + "'" +
            ", status='" + getStatus() + "'" +
            ", destination='" + getDestination() + "'" +
            ", amount=" + getAmount() +
            ", fee=" + getFee() +
            ", timestamp='" + getTimestamp() + "'" +
            "}";
    }
}
