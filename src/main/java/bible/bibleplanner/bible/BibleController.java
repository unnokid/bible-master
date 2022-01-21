package bible.bibleplanner.bible;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BibleController {

    private BibleService bibleService;

    @Autowired
    public BibleController(BibleService bibleService) {
        this.bibleService = bibleService;
    }
    
    //요청처리
    @GetMapping("/bibles")
    public String list(Model model){
        List<Bible> bibles = bibleService.findBibles();
        model.addAttribute("bibles",bibles);
        return "list";
    }
}
