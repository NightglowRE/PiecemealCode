package service;

import dao.CategoryDAO;
import dao.RecordDAO;
import entity.Category;
import entity.Record;

import java.util.Collections;
import java.util.List;

/**
 * @ClassName CategoryService
 * @Description Category业务类
 * @Author NightGlower
 * @Date 2020/7/23 18:48
 * @Version 1.0
 */
public class CategoryService {
    CategoryDAO categoryDAO = new CategoryDAO();
    RecordDAO recordDAO = new RecordDAO();

    public List<Category> list(){
        List<Category> cs = categoryDAO.list();
        for (Category c : cs){
            List<Record> rs = recordDAO.list(c.id);
            c.recordNumber = rs.size();
        }
        Collections.sort(cs,(c1,c2)->c2.recordNumber-c1.recordNumber);

        return cs;
    }

    public void add(String name) {
        Category c = new Category();
        c.setName(name);
        categoryDAO.add(c);
    }

    public void update(int id, String name) {
        Category c = new Category();
        c.setName(name);
        c.setId(id);
        categoryDAO.update(c);
    }

    public void delete(int id) {
        categoryDAO.delete(id);
    }
}
