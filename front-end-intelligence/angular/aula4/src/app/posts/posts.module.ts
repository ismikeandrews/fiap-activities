import { PostsTopicsService } from './../services/posts-topics.service';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PostsTopicsComponent } from './posts-topics/posts-topics.component';



@NgModule({
  declarations: [PostsTopicsComponent],
  imports: [
    CommonModule
  ],
  providers: [
    PostsTopicsService,
  ]
})
export class PostsModule { }
