import { PostsTopicsService } from './../../services/posts-topics.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-posts-topics',
  templateUrl: './posts-topics.component.html',
  styleUrls: ['./posts-topics.component.scss']
})
export class PostsTopicsComponent implements OnInit {

  public topics: any[] = [] 

  constructor(
    private postsTopicsService: PostsTopicsService
  ) { }

  ngOnInit() {
    this.postsTopicsService.getList().subscribe(
      successRes => {
        console.log("Success: ", successRes);
        this.topics = successRes.data
      },
      errorRes => {
        console.log("Error", errorRes)
      },
    )
  }

}
