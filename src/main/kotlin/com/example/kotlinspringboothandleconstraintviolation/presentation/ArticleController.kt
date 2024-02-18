package com.example.kotlinspringboothandleconstraintviolation.presentation

import com.example.kotlinspringboothandleconstraintviolation.presentation.model.Article
import com.example.kotlinspringboothandleconstraintviolation.presentation.model.SingleArticleResponse
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.Length
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * null バリデーションのパターンごとにエンドポイントを作成するサンプルコントローラ
 *
 */
@RestController
@Validated
class ArticleController {
    /**
     * ConstraintViolationException の動作確認用エンドポイント
     *
     * @param slug
     * @param limit
     * @param offset
     * @param pageNumber
     * @return
     */
    @GetMapping("/articles/{slug}", produces = [MediaType.APPLICATION_JSON_VALUE])
    @Suppress("UnusedParameter")
    fun getArticle(
        @PathVariable("slug") @Length(min = 1, max = 32) slug: String,
        @RequestParam("limit", required = true) @NotNull @Max(value = 20) limit: Int?,
        @RequestParam("offset", required = true) @NotNull @Max(value = 20) offset: Int?,
        @RequestParam("page-number", required = true) @NotNull @Max(value = 20) pageNumber: Int?,
    ): ResponseEntity<SingleArticleResponse> {
        return ResponseEntity(
            SingleArticleResponse(
                Article(
                    slug = slug,
                    title = "title",
                    description = "description",
                    body = "body",
                )
            ),
            HttpStatus.OK
        )
    }
}
