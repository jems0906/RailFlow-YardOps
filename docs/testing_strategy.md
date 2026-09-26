# Testing strategy

Domain tests verify lifecycle defaults and rule outcomes. Service tests use Mockito-compatible repositories and `SimpleMeterRegistry` fixtures. Spring Boot MockMvc integration tests verify JSON contracts and persistence-backed endpoint behavior. CI runs the full Maven suite and the frontend production build for every push and pull request.