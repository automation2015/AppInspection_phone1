package auto.cn.greendaogenerate;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

import auto.cn.greendaogenerate.ItemList;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ITEM_LIST".
*/
public class ItemListDao extends AbstractDao<ItemList, Long> {

    public static final String TABLENAME = "ITEM_LIST";

    /**
     * Properties of entity ItemList.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ITEM_ID = new Property(1, String.class, "ITEM_ID", false, "ITEM__ID");
        public final static Property ITEM_PART_ID = new Property(2, String.class, "ITEM_PART_ID", false, "ITEM__PART__ID");
        public final static Property ITEM_PL_BZ_ID = new Property(3, String.class, "ITEM_PL_BZ_ID", false, "ITEM__PL__BZ__ID");
        public final static Property ITEM_NAME = new Property(4, String.class, "ITEM_NAME", false, "ITEM__NAME");
        public final static Property ITEM_CREATE_DATE = new Property(5, String.class, "ITEM_CREATE_DATE", false, "ITEM__CREATE__DATE");
        public final static Property Valid_Flag = new Property(6, String.class, "Valid_Flag", false, "VALID__FLAG");
        public final static Property Fk_part = new Property(7, Long.class, "fk_part", false, "FK_PART");
    };

    private DaoSession daoSession;

    private Query<ItemList> partList_ItemsQuery;

    public ItemListDao(DaoConfig config) {
        super(config);
    }
    
    public ItemListDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ITEM_LIST\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ITEM__ID\" TEXT," + // 1: ITEM_ID
                "\"ITEM__PART__ID\" TEXT," + // 2: ITEM_PART_ID
                "\"ITEM__PL__BZ__ID\" TEXT," + // 3: ITEM_PL_BZ_ID
                "\"ITEM__NAME\" TEXT," + // 4: ITEM_NAME
                "\"ITEM__CREATE__DATE\" TEXT," + // 5: ITEM_CREATE_DATE
                "\"VALID__FLAG\" TEXT," + // 6: Valid_Flag
                "\"FK_PART\" INTEGER);"); // 7: fk_part
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ITEM_LIST\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ItemList entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ITEM_ID = entity.getITEM_ID();
        if (ITEM_ID != null) {
            stmt.bindString(2, ITEM_ID);
        }
 
        String ITEM_PART_ID = entity.getITEM_PART_ID();
        if (ITEM_PART_ID != null) {
            stmt.bindString(3, ITEM_PART_ID);
        }
 
        String ITEM_PL_BZ_ID = entity.getITEM_PL_BZ_ID();
        if (ITEM_PL_BZ_ID != null) {
            stmt.bindString(4, ITEM_PL_BZ_ID);
        }
 
        String ITEM_NAME = entity.getITEM_NAME();
        if (ITEM_NAME != null) {
            stmt.bindString(5, ITEM_NAME);
        }
 
        String ITEM_CREATE_DATE = entity.getITEM_CREATE_DATE();
        if (ITEM_CREATE_DATE != null) {
            stmt.bindString(6, ITEM_CREATE_DATE);
        }
 
        String Valid_Flag = entity.getValid_Flag();
        if (Valid_Flag != null) {
            stmt.bindString(7, Valid_Flag);
        }
 
        Long fk_part = entity.getFk_part();
        if (fk_part != null) {
            stmt.bindLong(8, fk_part);
        }
    }

    @Override
    protected void attachEntity(ItemList entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ItemList readEntity(Cursor cursor, int offset) {
        ItemList entity = new ItemList( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ITEM_ID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // ITEM_PART_ID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ITEM_PL_BZ_ID
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ITEM_NAME
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // ITEM_CREATE_DATE
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // Valid_Flag
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7) // fk_part
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ItemList entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setITEM_ID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setITEM_PART_ID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setITEM_PL_BZ_ID(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setITEM_NAME(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setITEM_CREATE_DATE(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setValid_Flag(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFk_part(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ItemList entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ItemList entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "items" to-many relationship of PartList. */
    public List<ItemList> _queryPartList_Items(Long fk_part) {
        synchronized (this) {
            if (partList_ItemsQuery == null) {
                QueryBuilder<ItemList> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Fk_part.eq(null));
                partList_ItemsQuery = queryBuilder.build();
            }
        }
        Query<ItemList> query = partList_ItemsQuery.forCurrentThread();
        query.setParameter(0, fk_part);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getPartListDao().getAllColumns());
            builder.append(" FROM ITEM_LIST T");
            builder.append(" LEFT JOIN PART_LIST T0 ON T.\"FK_PART\"=T0.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected ItemList loadCurrentDeep(Cursor cursor, boolean lock) {
        ItemList entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        PartList partList = loadCurrentOther(daoSession.getPartListDao(), cursor, offset);
        entity.setPartList(partList);

        return entity;    
    }

    public ItemList loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<ItemList> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<ItemList> list = new ArrayList<ItemList>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<ItemList> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<ItemList> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
