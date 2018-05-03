import com.template.guice.CommentModule;
import com.template.guice.CommentService;
import com.template.guice.InjectorsBuilder;

public class Main {

    public static void main(String[] args){
        InjectorsBuilder.getBuilder().build(new CommentModule());
        CommentService commentService = InjectorsBuilder.getBuilder().getInstanceByType(CommentService.class);
        commentService.comment();
    }
}
