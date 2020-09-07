package auto.cn.greendaogenerate;

import java.util.List;
import auto.cn.greendaogenerate.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ITEM_LIST".
 */
public class ItemList {

    private Long id;
    private String ITEM_ID;
    private String ITEM_PART_ID;
    private String ITEM_PL_BZ_ID;
    private String ITEM_NAME;
    private String ITEM_CREATE_DATE;
    private String Valid_Flag;
    private Boolean itemFinish;
    private Long fk_part;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ItemListDao myDao;

    private Equiplist equiplist;
    private Long equiplist__resolvedKey;

    private List<ContentList> contents;

    public ItemList() {
    }

    public ItemList(Long id) {
        this.id = id;
    }

    public ItemList(Long id, String ITEM_ID, String ITEM_PART_ID, String ITEM_PL_BZ_ID, String ITEM_NAME, String ITEM_CREATE_DATE, String Valid_Flag, Boolean itemFinish, Long fk_part) {
        this.id = id;
        this.ITEM_ID = ITEM_ID;
        this.ITEM_PART_ID = ITEM_PART_ID;
        this.ITEM_PL_BZ_ID = ITEM_PL_BZ_ID;
        this.ITEM_NAME = ITEM_NAME;
        this.ITEM_CREATE_DATE = ITEM_CREATE_DATE;
        this.Valid_Flag = Valid_Flag;
        this.itemFinish = itemFinish;
        this.fk_part = fk_part;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getItemListDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getITEM_ID() {
        return ITEM_ID;
    }

    public void setITEM_ID(String ITEM_ID) {
        this.ITEM_ID = ITEM_ID;
    }

    public String getITEM_PART_ID() {
        return ITEM_PART_ID;
    }

    public void setITEM_PART_ID(String ITEM_PART_ID) {
        this.ITEM_PART_ID = ITEM_PART_ID;
    }

    public String getITEM_PL_BZ_ID() {
        return ITEM_PL_BZ_ID;
    }

    public void setITEM_PL_BZ_ID(String ITEM_PL_BZ_ID) {
        this.ITEM_PL_BZ_ID = ITEM_PL_BZ_ID;
    }

    public String getITEM_NAME() {
        return ITEM_NAME;
    }

    public void setITEM_NAME(String ITEM_NAME) {
        this.ITEM_NAME = ITEM_NAME;
    }

    public String getITEM_CREATE_DATE() {
        return ITEM_CREATE_DATE;
    }

    public void setITEM_CREATE_DATE(String ITEM_CREATE_DATE) {
        this.ITEM_CREATE_DATE = ITEM_CREATE_DATE;
    }

    public String getValid_Flag() {
        return Valid_Flag;
    }

    public void setValid_Flag(String Valid_Flag) {
        this.Valid_Flag = Valid_Flag;
    }

    public Boolean getItemFinish() {
        return itemFinish;
    }

    public void setItemFinish(Boolean itemFinish) {
        this.itemFinish = itemFinish;
    }

    public Long getFk_part() {
        return fk_part;
    }

    public void setFk_part(Long fk_part) {
        this.fk_part = fk_part;
    }

    /** To-one relationship, resolved on first access. */
    public Equiplist getEquiplist() {
        Long __key = this.fk_part;
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
            fk_part = equiplist == null ? null : equiplist.getId();
            equiplist__resolvedKey = fk_part;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<ContentList> getContents() {
        if (contents == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ContentListDao targetDao = daoSession.getContentListDao();
            List<ContentList> contentsNew = targetDao._queryItemList_Contents(id);
            synchronized (this) {
                if(contents == null) {
                    contents = contentsNew;
                }
            }
        }
        return contents;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetContents() {
        contents = null;
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
