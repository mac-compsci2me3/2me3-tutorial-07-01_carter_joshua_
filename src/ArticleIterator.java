import java.util.Iterator;
import java.util.List;
                    
public class ArticleIterator implements Iterator<ArticleComponent> {
    private List<ArticleComponent> components;
    private int index = 0;

    ArticleIterator(List<ArticleComponent> components)
    {
        this.components = components;
        this.index = 0;
    }

    @Override
    public boolean hasNext()
    {
        return this.index < components.size();
    }

    @Override
    public ArticleComponent next()
    {
        return components.get(this.index++); // increases index after using its value
    }
}
