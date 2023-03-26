package test;

public class testEntity {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    private String qid;

    public testEntity(String id, String qid) {
        this.id = id;
        this.qid = qid;
    }

    public testEntity(){}
}
