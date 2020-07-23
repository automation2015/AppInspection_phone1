package auto.cn.greendaogenerate;

import java.util.List;
import auto.cn.greendaogenerate.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "PART_LIST".
 */
public class PartList {

    private Long id;
    private String PART_ID;
    private String PART_BZ_ID;
    private String PART_NAME;
    private String PART_CREATE_DATE;
    private String Valid_Flag;
    private Long fk_equip;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient PartListDao myDao;

    private Equiplist equiplist;
    private Long equiplist__resolvedKey;

    private List<ItemList> items;

    public PartList() {
    }

    public PartList(Long id) {
        this.id = id;
    }

    public PartList(Long id, String PART_ID, String PART_BZ_ID, String PART_NAME, String PART_CREATE_DATE, String Valid_Flag, Long fk_equip) {
        this.id = id;
        this.PART_ID = PART_ID;
        this.PART_BZ_ID = PART_BZ_ID;
        this.PART_NAME = PART_NAME;
        this.PART_CREATE_DATE = PART_CREATE_DATE;
        this.Valid_Flag = Valid_Flag;
        this.fk_equip = fk_equip;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPartListDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPART_ID() {
        return PART_ID;
    }

    public void setPART_ID(String PART_ID) {
        this.PART_ID = PART_ID;
    }

    public String getPART_BZ_ID() {
        return PART_BZ_ID;
    }

    public void setPART_BZ_ID(String PART_BZ_ID) {
        this.PART_BZ_ID = PART_BZ_ID;
    }

    public String getPART_NAME() {
        return PART_NAME;
    }

    public void setPART_NAME(String PART_NAME) {
        this.PART_NAME = PART_NAME;
    }

    public String getPART_CREATE_DATE() {
        return PART_CREATE_DATE;
    }

    public void setPART_CREATE_DATE(String PART_CREATE_DATE) {
        this.PART_CREATE_DATE = PART_CREATE_DATE;
    }

    public String getValid_Flag() {
        return Valid_Flag;
    }

    public void setValid_Flag(String Valid_Flag) {
        this.Valid_Flag = Valid_Flag;
    }

    public Long getFk_equip() {
        return fk_equip;
    }

    public void setFk_equip(Long fk_equip) {
        this.fk_equip = fk_equip;
    }

    /** To-one relationship, resolved on first access. */
    public Equiplist getEquiplist() {
        Long __key = this.fk_equip;
        if (equiplist__resolvedKey == null || !equiplist__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            EquiplistDao targetDao = daoSession.getEquiplistDao();
            Equiplist equiplistNew = targetDao.load(__key);
            synchronized (this) {
                equiplist = equiplistNew;
            	equiplist__resolvedKey = __key;
            }
        }
        return equiplist;
    }

    public void setEquiplist(Equiplist equiplist) {
        synchronized (this) {
            this.equiplist = equiplist;
            fk_equip = equiplist == null ? null : equiplist.getId();
            equiplist__resolvedKey = fk_equip;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<ItemList> getItems() {
        if (items == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ItemListDao targetDao = daoSession.getItemListDao();
            List<ItemList> itemsNew = targetDao._queryPartList_Items(id);
            synchronized (this) {
                if(items == null) {
                    items = itemsNew;
                }
            }
        }
        return items;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetItems() {
        items = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
