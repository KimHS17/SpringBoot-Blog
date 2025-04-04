package blog.blogstudy.service;

import blog.blogstudy.domain.Article;
import blog.blogstudy.dto.AddArticleRequest;
import blog.blogstudy.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
