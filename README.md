## Mountain Finder

## API Usage
[API 사용 가이드](https://data.go.kr/cmm/cmm/fileDownload.do?atchFileId=FILE_000000002657027&fileDetailSn=1)

```local.properties``` Gradle 속성 파일 내에 API_KEY 변수와 BASE_URL 변수를 추가합니다.

|변수| 설명                                |
|---|-----------------------------------|
|API_KEY| 공공데이터포털에서 발급받은 API Key 값          |
|BASE_URL| API Key를 이용해 서버에 접근하기 위한 Base URL |

- Kotlin 상에서 Gradle 속성에 정의된 변수로의 접근은 다음과 같습니다.
```kotlin
val API_KEY = BuildConfig.API_KEY
val BASE_URL = BuildConfig.BASE_URL
```

## Conventions

- 모든 작업내용은 Issue로 작성한 뒤, Branch를 분리해 작업하고, PR을 통해 Code-Review 이후 Master Branch에 Merge 합니다.

---

### Commit Rule
```
__Action__ __FileName__ : __Description__
```
- Action 은 다음과 같이 두가지 종류로 구분됩니다.
  - Added : 새로운 파일을 추가한 경우
  - Update : 특정 파일을 수정한 경우
- FileName 은 추가 혹은 수정한 파일의 이름을 의미합니다.
  - Gradle, Gitignore과 같이 프로젝트 전역의 설정 파일을 수정한 경우에는 ```Update Project```와 같이 작성합니다.
- Description 은 Commit에서 변경된 내용을 한 문장으로 요약합니다.

#### Commit Example
```
Added README.md
```
```
Update MainActivity : Added Login Button on Base Component
```
```
Update Project : Set Gradle Version to 7.3.1
```

---

### Branch Rule
```
TYPE/BRANCH_NAME
```
- 기본적으로 Branch의 이름은 Issue의 이름을 따릅니다.
- TYPE은 다음 중 하나를 해당하는 Issue의 Type과 동일하게 선택합니다.
  - dev : 일반적인 개발 사항
  - fix : 기존에 개발된 내용을 수정하는 사항
  - doc : README 등 문서에 관련된 사항
- BRANCH_NAME은 해당하는 Issue의 Title을 적절히 변형합니다.

#### Branch Example
```
dev/base-activity
```
```
docs/readme-base
```

---

### Issue / PR Rule

#### Title
```
[TYPE] TITLE
```
- TYPE 은 다음 중 하나를 선택합니다.
  - DEV : 일반적인 개발 사항
  - FIX : 기존에 개발된 내용을 수정하는 사항
  - DOC : README 등 문서에 관련된 사항

####  Content
```markdown
## Summary
Summary of Issue or PR

## Description
Detail Description of Issue or PR
```
- Description 항목이 불필요한 경우에는 생략할 수 있습니다.
- FIX Issue 혹은 UI에 관련된 PR의 경우는, Description에 스크린샷을 첨부해주시기 바랍니다.
- Issue 작성 시, Assignee와 Label을 지정하고, 생성한 Branch를 Development 항목에 지정해줍니다.
- PR 작성 시, Assignee와 Label을 지정하고, Reviewer을 상호로 지정하고, 해당하는 Issue를 Development 항목에 지정해줍니다.

[Issue Example](https://github.com/yymin1022/Mountain_Finder/issues/1)

[PR Example](https://github.com/yymin1022/Mountain_Finder/pull/3)