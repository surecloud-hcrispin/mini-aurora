package main.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import main.modules.ApplicationEntity;
import main.modules.View;
import main.services.EntityService;
import main.services.ResponseService;
import main.services.ViewService;
import main.modules.Attribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class QueryResolver implements GraphQLQueryResolver {

    private final ResponseService responseService;
    private final EntityService entityService;
    private final ViewService viewService;

    @Autowired
    public QueryResolver(ResponseService responseService, EntityService entityService, ViewService viewService) {
        this.responseService = responseService;
        this.entityService = entityService;
        this.viewService = viewService;
    }

    public List<Attribute> attributes() {
        return responseService.getAllResponses();
    }
    public List<View> views() {
        return viewService.getAllViews();
    }
    public List<ApplicationEntity> entities() {
        return entityService.getAllEntities();
    }
}