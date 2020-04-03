import { NgModule } from '@angular/core';
import { PhotoComponent } from './photo/photo.component';
import { PhotosListComponent } from './photos-list/photos-list.component';

@NgModule({
    declarations: [PhotoComponent, PhotosListComponent],
    exports: [PhotoComponent]
})

export class PhotosModule{}